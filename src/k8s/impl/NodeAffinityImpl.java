/**
 */
package k8s.impl;

import java.util.Collection;
import k8s.K8sPackage;
import k8s.NodeAffinity;
import k8s.NodeSelector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getRequiredDuringSchedulingIgnoredDuringExecution() <em>Required During Scheduling Ignored During Execution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredDuringSchedulingIgnoredDuringExecution()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSelector> requiredDuringSchedulingIgnoredDuringExecution;

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
	public EList<NodeSelector> getRequiredDuringSchedulingIgnoredDuringExecution() {
		if (requiredDuringSchedulingIgnoredDuringExecution == null) {
			requiredDuringSchedulingIgnoredDuringExecution = new EObjectResolvingEList<NodeSelector>(NodeSelector.class, this, K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION);
		}
		return requiredDuringSchedulingIgnoredDuringExecution;
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
				return getRequiredDuringSchedulingIgnoredDuringExecution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION:
				getRequiredDuringSchedulingIgnoredDuringExecution().clear();
				getRequiredDuringSchedulingIgnoredDuringExecution().addAll((Collection<? extends NodeSelector>)newValue);
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
				getRequiredDuringSchedulingIgnoredDuringExecution().clear();
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
				return requiredDuringSchedulingIgnoredDuringExecution != null && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeAffinityImpl
