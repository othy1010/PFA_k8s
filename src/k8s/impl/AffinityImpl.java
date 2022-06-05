/**
 */
package k8s.impl;

import k8s.Affinity;
import k8s.K8sPackage;
import k8s.NodeAffinity;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getNodeAffinity() <em>Node Affinity</em>}' reference.
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
		if (nodeAffinity != null && nodeAffinity.eIsProxy()) {
			InternalEObject oldNodeAffinity = (InternalEObject)nodeAffinity;
			nodeAffinity = (NodeAffinity)eResolveProxy(oldNodeAffinity);
			if (nodeAffinity != oldNodeAffinity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.AFFINITY__NODE_AFFINITY, oldNodeAffinity, nodeAffinity));
			}
		}
		return nodeAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAffinity basicGetNodeAffinity() {
		return nodeAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeAffinity(NodeAffinity newNodeAffinity) {
		NodeAffinity oldNodeAffinity = nodeAffinity;
		nodeAffinity = newNodeAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.AFFINITY__NODE_AFFINITY, oldNodeAffinity, nodeAffinity));
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
				if (resolve) return getNodeAffinity();
				return basicGetNodeAffinity();
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
