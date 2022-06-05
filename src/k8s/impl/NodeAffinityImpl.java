/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.NodeAffinity;
import k8s.NodeSelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Affinity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.NodeAffinityImpl#getRequiredDuringSchedulingIgnoredDuringExecution <em>Required During Scheduling Ignored During Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeAffinityImpl extends MinimalEObjectImpl.Container implements NodeAffinity {
	/**
	 * The cached value of the '{@link #getRequiredDuringSchedulingIgnoredDuringExecution() <em>Required During Scheduling Ignored During Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredDuringSchedulingIgnoredDuringExecution()
	 * @generated
	 * @ordered
	 */
	protected NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeAffinityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.NODE_AFFINITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
		if (requiredDuringSchedulingIgnoredDuringExecution != null && requiredDuringSchedulingIgnoredDuringExecution.eIsProxy()) {
			InternalEObject oldRequiredDuringSchedulingIgnoredDuringExecution = (InternalEObject)requiredDuringSchedulingIgnoredDuringExecution;
			requiredDuringSchedulingIgnoredDuringExecution = (NodeSelector)eResolveProxy(oldRequiredDuringSchedulingIgnoredDuringExecution);
			if (requiredDuringSchedulingIgnoredDuringExecution != oldRequiredDuringSchedulingIgnoredDuringExecution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION, oldRequiredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution));
			}
		}
		return requiredDuringSchedulingIgnoredDuringExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelector basicGetRequiredDuringSchedulingIgnoredDuringExecution() {
		return requiredDuringSchedulingIgnoredDuringExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector newRequiredDuringSchedulingIgnoredDuringExecution) {
		NodeSelector oldRequiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
		requiredDuringSchedulingIgnoredDuringExecution = newRequiredDuringSchedulingIgnoredDuringExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION, oldRequiredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION:
				if (resolve) return getRequiredDuringSchedulingIgnoredDuringExecution();
				return basicGetRequiredDuringSchedulingIgnoredDuringExecution();
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
			case K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION:
				setRequiredDuringSchedulingIgnoredDuringExecution((NodeSelector)newValue);
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
			case K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION:
				setRequiredDuringSchedulingIgnoredDuringExecution((NodeSelector)null);
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
			case K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION:
				return requiredDuringSchedulingIgnoredDuringExecution != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeAffinityImpl
