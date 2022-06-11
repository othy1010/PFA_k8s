/**
 */
package k8s.impl;

import k8s.Affinity;
import k8s.K8sPackage;
import k8s.NodeAffinity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affinity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.AffinityImpl#getNodeAffinity <em>Node Affinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffinityImpl extends MinimalEObjectImpl.Container implements Affinity {
	/**
	 * The cached value of the '{@link #getNodeAffinity() <em>Node Affinity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAffinity()
	 * @generated
	 * @ordered
	 */
	protected NodeAffinity nodeAffinity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffinityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.AFFINITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAffinity getNodeAffinity() {
		return nodeAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeAffinity(NodeAffinity newNodeAffinity, NotificationChain msgs) {
		NodeAffinity oldNodeAffinity = nodeAffinity;
		nodeAffinity = newNodeAffinity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.AFFINITY__NODE_AFFINITY, oldNodeAffinity, newNodeAffinity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAffinity(NodeAffinity newNodeAffinity) {
		if (newNodeAffinity != nodeAffinity) {
			NotificationChain msgs = null;
			if (nodeAffinity != null)
				msgs = ((InternalEObject)nodeAffinity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.AFFINITY__NODE_AFFINITY, null, msgs);
			if (newNodeAffinity != null)
				msgs = ((InternalEObject)newNodeAffinity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.AFFINITY__NODE_AFFINITY, null, msgs);
			msgs = basicSetNodeAffinity(newNodeAffinity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.AFFINITY__NODE_AFFINITY, newNodeAffinity, newNodeAffinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.AFFINITY__NODE_AFFINITY:
				return basicSetNodeAffinity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.AFFINITY__NODE_AFFINITY:
				return getNodeAffinity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.AFFINITY__NODE_AFFINITY:
				setNodeAffinity((NodeAffinity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.AFFINITY__NODE_AFFINITY:
				setNodeAffinity((NodeAffinity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.AFFINITY__NODE_AFFINITY:
				return nodeAffinity != null;
		}
		return super.eIsSet(featureID);
	}

} //AffinityImpl
